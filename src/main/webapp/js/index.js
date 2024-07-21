/**
 * HTML要素の値をクリアする\
 * checkboxまたはradioの場合は未選択状態となり、selectはselectedIndexを`0`にする
 * @param {HTMLInputElement} el HTML要素
 */
function clearElementValue(el) {
  switch (el.type) {
    case "text":
    case "password":
    case "email":
    case "textarea":
    case "tel":
    case "number":
    case "date":
      el.value = ""
      break;
    case "checkbox":
    case "radio":
      el.checked = false;
      break;
    case "select-one":
    case "select-multiple":
      el.selectedIndex = 0;
      break;
    default:
      break;
  }
}