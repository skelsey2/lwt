var appHeader=angular.module("LWT");

appHeader.controller("HeaderPanel",function($scope,$rootScope){
	$rootScope.updateNavbarSelection=function(newSelection){
		$(".navSelected").removeClass("navSelected");
		$("#nav"+newSelection).addClass("navSelected");
	};
});