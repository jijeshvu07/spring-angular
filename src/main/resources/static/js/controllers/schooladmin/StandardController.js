'use strict';

/**
 * StandardController
 * @constructor
 */

App.controller('standardController',['$scope','$http','standardService',
                                     function($scope,$http,standardService){

	
	
	$scope.addStandard = function(standard){
		console.log(standard)
		 $http.post('saveStandard' ,{
			 standard : standard
		 }).success(function(data, status, headers) {
            console.log(data)
        });
		$scope.clearStandardForm();
		//$scope.fetchStandardList();
	};
	
	$scope.fetchStandardList = function() {
		  $http.get('getStandards')
          .success(function(data){
        	  console.log(data)
          	 $scope.standards = data;
          });
    };
    
    $scope.viewStandard = function(standard){
    	console.log(standard)
    	$scope.standard.name = standard.name;
    }
	
	 $scope.clearStandardForm = function(){
	    	$scope.standard = {};
	 }
	 $scope.clearStandardForm();
	 $scope.fetchStandardList();
}]);



