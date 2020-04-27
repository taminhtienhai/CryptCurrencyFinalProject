/** Active button after click **/
$("aside button").click(function (e) { 
    e.preventDefault()
    $('aside').find(".active").removeClass("active")
    $(this).addClass("active")
})

function renderView(path, selector) {
    $.get(path).done((view) => {
        $(selector).empty().append(view)
    })
}

/**
 * Render Send Transaction Page
 */
 function renderSendTransaction() {
    renderView('/render/view/transactions/add', 'body > main')
    renderView('/render/view/transactions/send', 'body > article')
 }

 /**
  * Render Dashboard Tab
  */
 function renderDashboardTab() {
    renderView('/render/view/tab/dashboard', 'body > main')
    $('body > article').empty()
 }