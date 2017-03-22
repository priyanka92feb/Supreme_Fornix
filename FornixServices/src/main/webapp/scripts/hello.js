angular.module('demo',[])
.controller('Hello', function($scope, $http) {
	
	$http({
		url: 'http://localhost:8090/fornix/test',
		method: 'GET',
		params: {Id: 'Priyanka'}
			
	}).then(function successCallback(response){
				$scope.greeting = response.data;
		});
});