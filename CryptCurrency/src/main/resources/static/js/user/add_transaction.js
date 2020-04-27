$('#transaction').submit(function(e) {
    e.preventDefault()
    $.post('/transactions/add')
        .done((transaction) => {
            $('#block').append(transaction)
        })
})

function editTransaction() {
    $(this).hide('slow',() => { $(this).remove() })
}

function deleteTransction() {

}