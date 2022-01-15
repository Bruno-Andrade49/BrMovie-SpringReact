import {ReactComponent as GitHubIcon} from 'assets/img/Vector.svg';
import "./style.css";

function NavBar() {
    return (
        <header>
          <nav className="container">
            <div className="dsMovie-nav-content">
              <h1>RateBBMovies</h1>
              <a href="https://github.com/Bruno-Andrade49" target="_blank"> 
                <div className="link-gitHub">
                  <GitHubIcon/>
                  <p> /brunoAndrade </p>
                </div>
              </a>
            </div>
          </nav>
        </header>
      );
}

export default NavBar;