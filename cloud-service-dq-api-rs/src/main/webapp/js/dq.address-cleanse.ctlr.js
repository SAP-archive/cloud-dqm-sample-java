var dqApp = angular.module('dqApp', []);

dqApp.controller('dq.address-cleanse.ctlr', function ($scope, $http) {
    
    $scope.test = function() 
    {
    	$http({
    		  method: 'GET',
    		  url: 'api/v1/addressCleanse'
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
    	                        "addr_language"
    	                        ];
    	
    	var requestObj = {
				'addressInput': $scope.addressInput,
				'outputFields': outputFields
		};
    	
    	
    	$http({
    		  method: 'POST',
    		  url: 'api/v1/addressCleanse',
    		  data: requestObj,
    		  headers: 
    		  {
    			   'Content-Type': 'application/json'
    		  },
    		}).then(function successCallback(response) 
    		{
    			console.log('success', response);
    			
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
    			
    			
    			
    		}, function errorCallback(response) 
    		{
    			console.log('error', response);
    			alert(response.statusText);
    		});
    
    };
 
 
});


