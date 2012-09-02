'use strict';


// Declare app level module which depends on filters, and services
angular.module('wmsl.tech', []).
  config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {templateUrl: 'resources/angularjs/partials/home.html'});
    $routeProvider.when('/speaker/create', {templateUrl: 'resources/angularjs/partials/speaker/speaker-create.html', controller: CreateSpeakerCtrl});
    $routeProvider.otherwise({redirectTo: '/home'});
  }]);
