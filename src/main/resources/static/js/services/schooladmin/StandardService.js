'use strict';


App.factory('standardService',function($http){
	
	return{
		getAllStandards : function(){
			//return $http.get('getStandards?page='+page+'&size='+size);
			return $http.get('getStandards');
		}
	}
	
});