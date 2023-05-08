import React, { useState } from 'react'
// import (useState)
const Login = (props) => {
    const[email,setEmail] = useState('');
    const[pass,setPass] = useState('');

    const handleSubmit = (e) =>
    {
        e.preventDefault();
        console.log(email);
    }
  return (
    <>
    <form onSubmit={handleSubmit}>
        <label>Email</label>
        <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" placeholder='Email' id='email'name='email'/>
        <label>Password</label>
        <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder='Password' id='password'name='password'/>
        <button type='submit'>Log In</button>
    </form>
    <button onClick={() => props.onFormSwitch('register')}>Don't have an account? Register Here</button>
    </>
  )
}

export default Login