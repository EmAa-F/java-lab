import React, {useState} from 'react';

function ColorSelector(){
    const [selectedColor, setSelectedColor] = useState(null);
    const handleColorClick = (color) => {
        setSelectedColor(color);
    };

    return(
        <div style={{textAlign:'center', marginTop:'50px'}}>
            <h2>Select a Color</h2>
            <div style={{marginBottom:'20px'}}>

                <button onClick={() => handleColorClick('Red')} style={{backgroundColor:'red', color:'white', margin:'5px', padding:'10px 20px', border:'none', borderRadius:'5px', cursor:'pointer'}}>
                    Red
                </button> 

                <button onClick={() => handleColorClick('Blue')} style={{backgroundColor:'blue', color:'white', margin:'5px', padding:'10px 20px', border:'none', borderRadius:'5px', cursor:'pointer'}}>
                    Blue
                </button> 

                <button onClick={() => handleColorClick('Green')} style={{backgroundColor:'green', color:'white', margin:'5px', padding:'10px 20px', border:'none', borderRadius:'5px', cursor:'pointer'}}>
                    Green
                </button> 

                <button onClick={() => handleColorClick('Yellow')} style={{backgroundColor:'gold', color:'white', margin:'5px', padding:'10px 20px', border:'none', borderRadius:'5px', cursor:'pointer'}}>
                    Yellow
                </button>

            </div>
            {selectedColor && (
                <p style={{fontSize:'18px'}}>
                    You have selected <strong>{selectedColor}</strong>
                </p>
            )}
            
        </div>
    );
}

export default ColorSelector;