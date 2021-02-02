import axios from 'axios'


const api = axios.create({
    baseURL: 'http://localhost:8081/api/',
    headers:{
        'Content-Type': 'application/json',
        //Authorization : token && token.length > 0 ? `Bearer ${token}` : ''
    }
})

export default api;
