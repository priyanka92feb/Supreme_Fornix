angular.demo('demo',[])
.controller('Hello', function($scope, $http) {
	
	$http({
		url: 'http://localhost:8090/fornix/test',
		method: "GET",
		params: {Id: "Priyanka"}
			
	}).then(function success(response){
				$scope.greeting = response.data;
		});
});