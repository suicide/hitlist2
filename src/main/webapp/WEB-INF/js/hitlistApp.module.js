var hitlistApp = angular.module('hitlistApp', ['ngRoute', 'hitlistControllers', 'LinkFormatterModule']);

hitlistApp.config(['$routeProvider', 'LinkFormatter',
    function($routeProvider, LinkFormatter) {
        $routeProvider.
            when('/list', {
                templateUrl: 'partial/list.html',
                controller: 'HitlistListController'
            }).
            otherwise({
                redirectTo: '/list'
            });
    }]);