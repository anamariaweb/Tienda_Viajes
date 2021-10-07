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


});