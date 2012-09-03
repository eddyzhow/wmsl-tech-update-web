'use strict';

/* Controllers */
function CreateDayCtrl($scope, $http) {
	$scope.createDay = function() {
		$http.put('day', {
			remark: $scope.remark,
			date: $scope.date
		}).success(function(json) {
			console.log(json);
		});
	};
}
CreateDayCtrl.$inject = ['$scope', '$http'];