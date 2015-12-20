var agoraUSControllers = angular.module('AgoraUSControllers', [ 'ngRoute' ]);

function showHeaderAndFooter($scope,title) {
	// Esta función hay que llamarla en todos los controladores para que
	// muestren el título, header y footer
	$scope.date = new Date();
	$scope.title = title;
	$scope.footer = {
		name : "footer.html",
		url : "views/main/footer.html"
	};
	$scope.header = {
		name : "header.html",
		url : "views/main/header.html"
	};
}
// Header y Footer
agoraUSControllers.controller('MainController', [ '$scope', '$route',
		'$routeParams', '$location',
		function($scope, $route, $routeParams, $location) {
			$scope.$route = $route;
			$scope.$location = $location;
			$scope.$routeParams = $routeParams;
			showHeaderAndFooter($scope, null);
		} ]);

//Muestra una pantalla de error
agoraUSControllers.controller('ErrorController',['$scope','$routeParams',function($scope,$routeParams){
	showHeaderAndFooter($scope,"Error");
	$scope.params = $routeParams;
}]);

// Vista por defecto en index.html
agoraUSControllers.controller('MainViewController', [ '$scope', '$routeParams',
		function($scope, $routeParams) {
			showHeaderAndFooter($scope,"Inicio");
			$scope.params = $routeParams;
		} ]);

// Visualización de resultados
agoraUSControllers.controller('VisualizacionRestController', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {
			showHeaderAndFooter($scope,"Encuestas");
			$scope.encuestas = [];
			$http.get('api/resultados/encuestas.do').then(
					function successCallback(response) {
						console.log(response);
						console.log(angular.fromJson(response['data']));
						$scope.encuestas = angular.fromJson(response['data']);
					}, function errorCallback(response) {
						alert('Error obteniendo el objeto JSON');
					});
			$scope.params = $routeParams;
		} ]);