'use strict';

/* Controllers */
function CreateDayCtrl($scope, $http) {
	$scope.remark = 'remark here';
	$scope.createDay = function() {
		$http.put('day', {
			remark: $scope.remark
		}).success(function(json) {
			console.log(json);
		});
	};
}
CreateDayCtrl.$inject = ['$scope', '$http'];