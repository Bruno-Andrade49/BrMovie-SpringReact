import MovieCard from "components/MovieCard";
import MovieScore from "components/MovieScore";
import MovieStars from "components/movieStars";
import Pagination from "components/Pagination";


function Listning() {
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