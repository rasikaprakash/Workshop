import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css';
import Button from '@mui/material/Button';
import DeleteIcon from '@mui/icons-material/Delete';

function DisplayData() {
    const [data, setData] = useState([]);
  
    useEffect(() => {
      axios.get('http://127.0.0.1:8080/displayFam')
        .then(response => {
          setData(response.data);
        })
        .catch(error => {
          console.log(error);
        });
        
    }, 
   
    [])
  
    const handleDelete = (id) => {
      axios.delete(`http://127.0.0.1:8080/delEmp/${id}`)

      // window.location.reload();
    };
  const handleUpdate = async (id) => {
    let aaname = prompt("Enter name");
    let arelation = prompt("Enter relation");
    let aprofession = prompt("Enter profession");
    let aplace = prompt("Enter place");


    let newData = {
      age : id,
      name :aaname,
      relation : arelation,
      profession : aprofession,
      place : aplace
    }


   await axios.put(`http://127.0.0.1:8080/insert`, newData);

  }
  
  
    return (
      <div>
        <center>
        <h1>Details</h1>
        <div className='container'>
        <table>
          <thead>
            <tr>
              <th>Age</th><br/>
              
              <th>Name</th><br/>
              <th>Relation</th><br/>
              <th>Profession</th><br/>
              <th>place</th><br/>
             
            </tr>
          </thead>
          <tbody>
            {data.map(item => (
              <tr key={item.age}>
                <td>{item.age}</td><br/>
                
                <td>{item.name}</td><br/>
               
                <td>{item.relation}</td><br/>
                
                <td>{item.profession}</td><br/>
                
                <td>{item.place}</td><br/>
                
                
                <td><Button onClick={handleDelete(item.age)} variant="outlined" startIcon={<DeleteIcon />}>
        Delete
      </Button></td>
                <td><button onClick={() => handleUpdate(item.age)}>Update</button></td>

              </tr>
            ))}
          </tbody>
        </table>
        </div>
      <button>Add details</button> 
        </center>
      </div>
    );
  }
  
  export default DisplayData;
  