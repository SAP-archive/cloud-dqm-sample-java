var dqExampleServices = angular.module('dqExampleServices', ['ngResource']);
 
dqExampleServices.factory('Example', ['$resource',
  function($resource){
    return $resource('/example/:id', {id: '@id'}, 
    {
      get: { method:'GET', params:{}, isArray:false }
    });
  }]);
