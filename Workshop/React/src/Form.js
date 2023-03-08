import React from 'react';
import axios from 'axios';
import './App.css';
class Form extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      age: '',
      name : '',
      relation : '',
      profession : '',
      place : ''
    }
  }

  handleageChange = (event) =>{
    this.setState({age : event.target.value});
  }
  handleNameChange = (event) =>{
    this.setState({name : event.target.value});
  }
  handleRelationChange = (event) =>{
    this.setState({relation : event.target.value});
  }
  handleProfessionChange = (event) =>{
    this.setState({profession : event.target.value});
  }
  handleplaceChange = (event) =>{
    this.setState({place : event.target.value});
  }
  
  

  handleSubmit = async (event) => {
    event.preventDefault();
    
    const data = {
      age : this.state.age ,
      name : this.state.name , 
      relation : this.state.relation,
     profession  : this.state.profession ,
      place  : this.state.place,
     
    }
    console.log(data);
    await axios.post('http://127.0.0.1:8080/addEmp', data)

  };

  render (){
    return(
   
      <center>
      <br /><br />
      <form onSubmit={this.handleSubmit}>
        <div className='container'>
          <br/><br/>
        <input
          type="number"
          placeholder="Age"
          value={this.state.age}
          onChange={this.handleageChange}
        /><br/><br/>
        <input
          type="text"
          placeholder="name"
          value={this.state.name}
          onChange={this.handleNameChange}
        /><br/><br/>
        <input
          type="text"
          placeholder="Relation"
          value={this.state.relation}
          onChange={this.handleRelationChange}
        /><br/><br/>
        <input
          type="text"
          placeholder="profession"
          value={this.state.profession}
          onChange={this.handleProfessionChange}
        /><br/><br/>
        <input
          type="text"
          placeholder="place"
          value={this.state.place}
          onChange={this.handleplaceChange}
        /><br/><br/>
        
      <button type="submit">submit</button>
        </div>
      </form>
      </center>
  );
}
}
export default Form;