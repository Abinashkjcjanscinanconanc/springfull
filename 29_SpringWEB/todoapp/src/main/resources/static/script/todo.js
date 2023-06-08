function onRemove(id) {
    if(confirm('Do you want to remove ?')) {
        location.href = '/removetodo?id=' + id;  
    } 
}

function onCheckboxClick(id, checkbox) {
    const isChecked = checkbox.checked;
    location.href = '/iscomplted?id=' + id + "&iscomplete=" + isChecked;
}