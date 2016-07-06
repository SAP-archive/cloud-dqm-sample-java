var dqApp = angular.module('dqApp', ['dqServices']);

dqApp.controller('dq.address-cleanse.ctlr', ['$scope','AddressCleanse', function ($scope, AddressCleanse) {
    
    $scope.address = AddressCleanse.get();
 
}]);


