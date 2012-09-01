'use strict';

/* Controllers */


function CreateSpeakerCtrl($scope, $http) {
	$scope.createSpeaker = function() {
		$http.put('speaker', {
			'name': $scope.speakerName
		})
		.success(function(speaker) {
			console.log(speaker);
		});
	};
}
CreateSpeakerCtrl.$inject = ['$scope', '$http'];

