import MovieStars from "components/movieStars";
//import {ReactComponent as score} from "assets/img/3.8.svg";
//import {ReactComponent as count} from "assets/img/13avaliações.svg";
import "./style.css";

function MovieScore() {

    const count = 13;
    const score = 3.5;


    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>

    );
}

export default MovieScore;