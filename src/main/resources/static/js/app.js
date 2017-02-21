'use strict';

var AngularSpringApp = {};

var App = angular.module('EduCareApp', ['ngRoute','smart-table']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
	
    $routeProvider.when('/standard', {
        templateUrl: 'standard.html',
        controller: 'standardController'
    });

    $routeProvider.otherwise({redirectTo: '/standard'});

}]);
