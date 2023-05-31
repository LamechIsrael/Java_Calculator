const buttons = document.getElementsByTagName("button");
const field = document.getElementById("inputField");

for (button of buttons) {
  let id = button.innerHTML;
  if (!isNaN(id)) {
    id = parseInt(id);
  }
  button.addEventListener("click", function (Event) {
    field.value = id;
    console.log(id);
  });
}
