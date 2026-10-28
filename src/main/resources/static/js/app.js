/* Validación complementaria del formulario antes de enviarlo. */
document.addEventListener("DOMContentLoaded",()=>{const f=document.getElementById("formCita");f.addEventListener("submit",e=>{if(!document.getElementById("fecha").value){e.preventDefault();alert("Debe seleccionar una fecha.");}});});

// Evita seleccionar fechas anteriores al día actual.
const campoFecha = document.getElementById("fecha");

if (campoFecha) {
    const hoy = new Date().toISOString().split("T")[0];
    campoFecha.setAttribute("min", hoy);
}
// Validación del documento: solo números y máximo 10 dígitos.
const campoDocumento = document.getElementById("documento");

if (campoDocumento) {
    campoDocumento.addEventListener("input", function () {
        this.value = this.value.replace(/\D/g, "").slice(0, 10);
    });
}