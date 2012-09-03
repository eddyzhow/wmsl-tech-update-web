'use strict';

/* Controllers */
function CreateDayCtrl($scope, $http) {
	$scope.createDay = function() {
		$http.put('day', {
			remark: $scope.remark
		}).success(function(json) {
			console.log(json);
		});
	};
}
CreateDayCtrl.$inject = ['$scope', '$http'];