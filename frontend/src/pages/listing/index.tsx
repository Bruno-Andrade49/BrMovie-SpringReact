import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";


function Listning() {

    //FORMA ERRADA!
    //axios.get(`${BASE_URL}/movies`).then(response => { console.log(response.data)})

    //FORMA CORRETA!

    const [pageNumber, setPageNumber] = useState(0); 
     
    useEffect(() => {
        axios.get(`${BASE_URL}/movies`)
        .then(response => { 
            const data = response.data as MoviePage;
            setPageNumber(data.number)})
    }, [])




    return (
        <>

            <p>{pageNumber}</p>
            <Pagination />
            <div className="container">
                <div className="row">
                    <div className="col-md-3 mb-3">
                        <MovieCard></MovieCard>
                    </div>
                    <div className="col-md-3 mb-3">
                        <MovieCard></MovieCard>
                    </div>
                    <div className="col-md-3 mb-3">
                        <MovieCard></MovieCard>
                    </div>
                    <div className="col-md-3 mb-3">
                        <MovieCard></MovieCard>
                    </div>
                    <div className="col-md-3 mb-3">
                        <MovieCard></MovieCard>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Listning;