// Escribe tu código aquí.
const input = document.getElementById("input");
function palabrasMasLargas(palabra, arrayPalabras) {
  const palabrasLargas = arrayPalabras.filter((palabraActual) => {
    return palabraActual.length > palabra.length;
  });
  return palabrasLargas;
}

const lista = document.querySelector("ul");
function imprimirLista(arrayPalabras) {
  const lista = document.querySelector("ul");
  lista.innerHTML = ""; // Limpiar lista antes de agregar nuevos elementos

  arrayPalabras.forEach((palabra) => {
    const elementoLista = document.createElement("li");
    elementoLista.textContent = palabra;
    lista.appendChild(elementoLista);
  });
}

const boton = document.querySelector("button");

boton.addEventListener("click", () => {
  const palabraEntrada = input.value;
  const myArray = [
    "insecto",
    "bootcamp",
    "mangos",
    "reptil",
    "mosca",
    "escritorio",
  ];
  const palabrasLargas = palabrasMasLargas(palabraEntrada, myArray);
  imprimirLista(palabrasLargas);
});
