$(document).ready(function() {
	$('a.active').removeClass('active');
	$('a[href="' + location.pathname + '"]').addClass('active');

	$('.delete-item').on('click', function(e) {
		e.preventDefault();

		Swal.fire({
			title: '¿Estas seguro de eliminar?',
			text: "¡Esta accion no se puede revertir!",
			icon: 'warning',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			cancelButtonText: 'Cancelar',
			confirmButtonText: 'Si, eliminar!'
		}).then((result) => {
			if (result.isConfirmed) {
				let rutaEliminar = $(e.target).attr('href');
				$.get(rutaEliminar);

				Swal.fire({

					title: 'Eliminado!',
					text: 'El item ha sido eliminado.',
					icon: 'success',
					showConfirmButton: false
				})
				setTimeout(function() {
					location.reload();
				}, 1000)
			}
		})

	})

	$('#login').submit(function(e) {
		e.preventDefault();

		$.ajax({
			type: $('#login').attr('method'),
			url: $('#login').attr('action'),
			data: $('#login').serialize(),
			success: function(data) {
				if (data == 1) {
					let timerInterval
					Swal.fire({
						text: 'Lo estamos logeando!',
						timer: 1000,
						position: 'top-end',
						timerProgressBar: true,
						showConfirmButton: false,
						icon: 'success',
					}).then((result) => {
						/* Read more about handling dismissals below */
						if (result.dismiss === Swal.DismissReason.timer) {
							window.location.href = '/user/listar';
						}
					})
				}
				else {
					Swal.fire({
						text: 'Credenciales invalidas!',
						timer: 1500,
						position: 'top-end',
						timerProgressBar: true,
						showConfirmButton: false,
						icon: 'warning',
					})
				}
			}
		});

	})

});