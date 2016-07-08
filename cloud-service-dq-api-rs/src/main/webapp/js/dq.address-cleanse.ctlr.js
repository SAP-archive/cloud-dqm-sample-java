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
    			
    		}, function errorCallback(response) {
    		    // called asynchronously if an error occurs
    		    // or server returns response with an error status.
    		  });
    
    };
    
    $scope.cleanse = function() 
    {
    	var outputFields = [
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
				'outputFields': outputFields
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
                        case 'I': $scope.message = 'Invalid address'; $("#msg").toggleClass('alert-danger', true); break;
                        case 'C': $scope.message = 'Corrected'; $("#msg").toggleClass('alert-warning', true); break;
                        case 'V': $scope.message = 'Valid'; $("#msg").toggleClass('alert-success', true); break;
                        default: 
                    }
                    
                }
            
                if (response.data.addr_info_code_msg != undefined)
                {
                    $scope.message = response.data.addr_info_code_msg; 
                }
                else
                {

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
        
        
        $scope.resetState = function()
        {
            $scope.message = "";
            
            $("#msg").toggleClass('alert-success', false);
            $("#msg").toggleClass('alert-warning', false);
            $("#msg").toggleClass('alert-info', false);
            $("#msg").toggleClass('alert-danger', false);
        };
        
    
    };
});


