import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";


function Listning() {

    axios.get(`${BASE_URL}/movies`).then(response => { console.log(response.data)})


    return (
        <>
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