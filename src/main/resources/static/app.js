var app = angular.module("LWT",["ngRoute", "ui.bootstrap"]);

app.controller("MainController", function($scope, $rootScope,  dataService){
});

app.config(function($routeProvider, $locationProvider) {
    $routeProvider
    .when("/",{
    	templateUrl : "episode/episode.html"
    })
    .when("/John-Oliver-Call-To-Action-Results", {
        templateUrl : "John-Oliver-Call-To-Action-Results/John-Oliver-Call-To-Action-Results.html"
    })
    .when("/Recent-Episodes",{
    	templateUrl : "episode/episode.html",
    	controller : "episodeController"
    })
    .when("/error", {
    	"redirectTo": "/"
    })
    .otherwise({"redirectTo": "/"});
    
    // use the HTML5 History API - remove #
    $locationProvider.html5Mode(true);
});

app.service("dataService", function($http, $rootScope) {
});