var hitlistControllers = angular.module('hitlistControllers', []);

hitlistControllers.controller('HitlistListController', ['$scope', '$http',
    function ($scope, $http) {

        $scope.hitlist = [{'name': 'Jane'},{'name': 'Joe'}];
    }]);
