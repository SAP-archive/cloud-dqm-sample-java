var dqServices = angular.module('dqServices', ['ngResource']);
 
dqServices.factory('AddressCleanse', ['$resource',
  function($resource){
    return $resource('api/v1/test', {}, {
      get: { method:'GET', params:{}, isArray:false }
    });
  }]);