import React,{useState} from 'react'

const Register = (props) => {
    const[user,setUser] = useState('');
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
        <label>Username</label>
        <input value={user} onChange={(e) => setUser(e.target.value)} type="text" placeholder='Username' id='username'name='username'/>
        <label>Email</label>
        <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" placeholder='Email' id='email'name='email'/>
        <label>Password</label>
        <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder='Password' id='password'name='password'/>
        <button type='submit'>Log In</button>
    </form>
    <button type='submit' onClick={() => props.onFormSwitch('login')}>Already have an Account? Log In Here</button>
    </>
  )
}

export default Register