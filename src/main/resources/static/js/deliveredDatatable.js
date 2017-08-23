$(document).ready( function () {
	 var table = $('#recordsTable').DataTable({
			"sAjaxSource": "/home/stationery/delivered/records",
         "sPaginationType" : 'simple_numbers',
         "iDisplayLength": 10,
			"sAjaxDataProp": "",
			"order": [[ 0, "dsc" ]],
         dom: "Bftipr",

			"aoColumns": [
                { "mData": "date"},
                { "mData": "item" },
                { "mData": "unit" },
                { "mData": "quantity" },
                { "mData": "department.name" },
				{"mData":"purpose"},
                { "mData": "taken_by" },
				{"mData": "remark"},
				{ "mRender": function (data, type, row) {
                      return '<a role="button" href="/home/stationery/delivered/view/'+row.id+'"><i class="fa fa-eye"></i></a>' +
						  '<a href="/home/stationery/delivered/edit/' + row.id+'"><i class="fa fa-edit"></i></a>' +
						  '<a data-toggle="modal" data-target="#myModal"><i class="fa fa-remove"></i></a>' +
						  '<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">' +
						  '<div class="modal-dialog" role="document">' +
						  '<div class="modal-content">' +
						  '<div class="modal-header">' +
						  '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
						  '<h4 class="modal-title" id="myModalLabel">Confirm</h4>' +
						  '</div>' +
						  '<div class="modal-body">' +
						  '<p>Are you sure?</p>' +
						  '</div>' +
						  '<div class="modal-footer">' +
						  '<button type="button" class="btn btn-default" data-dismiss="modal">Cancle</button>' +
						  '<a href="/home/stationery/delivered/delete/' + row.id+'" class="btn btn-danger" role="button">Delete</a></div>' +
						  '</div>' +
						  '</div>' +
						  '</div>'
                  }}


			],
 });

    $(table).on( 'click', 'tbody tr', function () {
        window.location.href = $(this).attr('href');
    } );

});

