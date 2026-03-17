let power = 100;
let doorClosed = false;
let animatronicLocation = "ESCENARIO";
let gameActive = true;

// Reducción de energía dinámica
const powerInterval = setInterval(() => {
    if (!gameActive) return;
    
    // Si la puerta está cerrada, consume el doble
    let consumption = doorClosed ? 2 : 1;
    power -= consumption;
    
    document.getElementById('power-percent').innerText = Math.max(0, power);
    if (power <= 0) gameOver("Te quedaste sin luz... Las puertas se abrieron.");
}, 3000);

// Movimiento con sistema de defensa
const moveInterval = setInterval(() => {
    if (!gameActive) return;

    const rooms = ["ESCENARIO", "COCINA", "PASILLO"];
    
    if (animatronicLocation === "PASILLO") {
        if (doorClosed) {
            console.log("¡El animatrónico golpeó la puerta y regresó!");
            animatronicLocation = "ESCENARIO"; // Lo mandamos atrás
        } else {
            gameOver("¡JUMPSCARE! No cerraste la puerta a tiempo.");
        }
    } else {
        // Mover al siguiente paso de la lista
        let currentIndex = rooms.indexOf(animatronicLocation);
        animatronicLocation = rooms[currentIndex + 1];
    }
}, 5000);

function toggleDoor() {
    doorClosed = !doorClosed;
    console.log(doorClosed ? "Puerta cerrada" : "Puerta abierta");
    // Aquí podrías cambiar el color de un botón en el HTML para feedback visual
}