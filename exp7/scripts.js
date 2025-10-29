const colors =['#FF5733','#33FF57','#3357FF','#FF33A1','#A133FF','#33FFF5','#FFD433','#FF8C33','#8C33FF','#33FF8C','#FF3333','#33A1FF','#A1FF33','#FF33F5','#F5FF33','#33FFD4', '#D433FF',    '#33D4FF','#FFD4D4', '#D4FFD4'
];
let colorIndex = Math.floor(Math.random() * colors.length);
let countdown=5;
function changeColor(){
    document.body.style.backgroundColor=colors[colorIndex];
    colorIndex=(colorIndex+1)%colors.length;
    countdown=5;
}
function updateTimer(){
    document.getElementById("timer").innerText=`Changing in: ${countdown} seconds`;
    countdown--;
    if (countdown<0){
        changeColor();
    }
}

changeColor();
setInterval(updateTimer,1000);