var dqApp = angular.module('dqApp', []);

dqApp.controller('dq.address-cleanse.ctlr', function ($scope, $http) {
    
    $scope.test = function() 
    {
    	$http({
    		  method: 'GET',
    		  url: 'dq/addressCleanse'
    		}).then(function successCallback(response) 
    		{
    		    // this callback will be called asynchronously
    		    // when the response is available
    			console.log('success', response);
            
                // clean state
                $scope.resetState();
    			
    		}, function errorCallback(response) {
    		    // called asynchronously if an error occurs
    		    // or server returns response with an error status.
    		  });
    
    };
    
    $scope.resetState = function()
    {
            $scope.message = "";
            
            $("#msg").removeClass('alert-success alert-warning alert-info alert-info');
            
            // clean controls
            $("#country-group").removeClass('has-success has-warning has-info has-info');
            $("#postal-code-group").removeClass('has-success has-warning has-info has-info'); 
            $("#region-group").removeClass('has-success has-warning has-info has-info');
            $("#city-group").removeClass('has-success has-warning has-info has-info');
            $("#address-line2-group").removeClass('has-success has-warning has-info has-info');
            $("#address-line1-group").removeClass('has-success has-warning has-info has-info');
  
        };
    
    $scope.example = function(id) 
    {
    	   $http({
    		  method: 'GET',
    		  url: 'dq/example/' + id,
    		}).then(function successCallback(response) 
    		{
    		    // this callback will be called asynchronously
    		    // when the response is available
    			console.log('success', response);
               
               // clean state
               $scope.resetState();
               
    			$scope.addressInput = response.data.addressInput;
    			
    			if (response.data.outputFields != undefined)
				{
    				$scope.outputFields = response.data.outputFields;
				}

    		}, function errorCallback(response) {
    		    // called asynchronously if an error occurs
    		    // or server returns response with an error status.
    			console.log('error', response);
    		  });
    };
    
    $scope.cleanse = function() 
    {
    	$scope.outputFields = [
    	                    	"std_addr_prim_address",
    	                    	"std_addr_sec_address",
    	                      	"std_addr_locality", 
    	                      	"std_addr_region",
    	                      	"std_addr_postcode_full", 
    	                      	"std_addr_country_2char",
    	                      	"addr_info_code",
    	                        "addr_info_code_msg",
    	                        "addr_asmt_info",
    	                        "addr_asmt_type",
    	                        "addr_asmt_level",
    	                        "addr_change_sig",
    	                        "addr_language"
    	                        ];
    	
    	var requestObj = {
				'addressInput': $scope.addressInput,
				'outputFields': $scope.outputFields
		};
    	
    	
    	$http({
    		  method: 'POST',
    		  url: 'dq/addressCleanse',
    		  data: requestObj,
    		  headers: 
    		  {
    			   'Content-Type': 'application/json'
    		  },
    		}).then(function successCallback(response) 
    		{
    			console.log('success', response);
    			
                // clean state
                $scope.resetState();
            
    			var responseObj = {
    				'mixed': response.data.std_addr_prim_address,
    				'mixed2': response.data.std_addr_sec_address,
    				'locality': response.data.std_addr_locality,
    				'region': response.data.std_addr_region,
    				'postcode': response.data.std_addr_postcode_full,
    			    'country': response.data.std_addr_country_2char
    			};
    			
    			// copy back into request model
    			$scope.addressInput = responseObj;
    			
    			// toogle msg area
    			$("#msg").toggleClass('alert-success', true);
    			$("#msg").toggleClass('alert-danger', false);
    			
                if (response.data.addr_asmt_info != undefined)
                {
                    switch (response.data.addr_asmt_info)
                    {
                        case 'B': $scope.message = 'Blank address sent'; $("#msg").toggleClass('alert-info', true); break;
                        case 'I': $scope.message = 'Invalid or incomplete address'; $("#msg").toggleClass('alert-danger', true); break;
                        case 'C': $scope.message = 'Corrected'; $("#msg").toggleClass('alert-warning', true); break;
                        case 'V': $scope.message = 'Valid'; $("#msg").toggleClass('alert-success', true); break;
                        default: 
                    }
                    
                }
            
                if (response.data.addr_info_code_msg != undefined)
                {
                    $scope.message = response.data.addr_info_code_msg; 
                }
            
                if (response.data.addr_asmt_level != undefined)
                {
                    switch (response.data.addr_asmt_level)
                    {
                            /*
                            
                            S: The address is validated through the secondary address information (floor, unit, etc.)
                            PR: The address is validated to the house number
                            PN: The address is validated to the street
                            L4: The address is validated to the fourth level of city information (locality4)
                            L3: The address is validated to the third level of city information (locality3)
                            L2: The address is validated to the second level of city information (locality2)
                            L1: The address is validated to the city (locality)
                            R: The address is validated to the region
                            C: The address is validated to the country
                            X: Unknown or unassigned
                            
                            */
                            case 'S': $("address-line2-group").addClass('has-success');
                            case 'PR': $("address-line1-group").addClass('has-success');
                            case 'PN': 
                            case 'L4': 
                            case 'L3': 
                            case 'L2': 
                            case 'L1': $("#city-group").addClass('has-success');  $("#postal-code-group").addClass('has-success');
                            case 'R': $("#region-group").addClass('has-success'); 
                            case 'C': $("#country-group").addClass('has-success'); 
                            case 'X': break;
                            default: break;
                    }
                }
    			
    		}, function errorCallback(response) 
    		{
    			console.log('error', response);
                
                // clean state
                $scope.resetState();
            
                $("#msg").toggleClass('alert-danger', true);
            
                if (response.data.cause != undefined)
                {
                	$scope.message = response.data.cause;
                } 
    		});
    };
});


