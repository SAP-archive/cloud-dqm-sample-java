var dqApp = angular.module('dqApp', ['ui.bootstrap', 'dqServices']);
 
dqApp.filter('timeago', function(){
  return function(date){
    return moment(date).fromNow();
  };
});
 
dqApp.directive('timeago', function() {
  return {
    restrict:'A',
    link: function(scope, element, attrs){
      attrs.$observe("timeago", function(){
        element.text(moment(attrs.timeago).fromNow());
      });
    }
  };
});

dqApp.controller('addressCleanseCtlr', ['$scope','AddressCleanse', function ($scope, AddressCleanse) {
    
    $scope.address = AddressCleanse.get();
 
}]);


