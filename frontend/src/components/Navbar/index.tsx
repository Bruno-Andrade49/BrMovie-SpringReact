import {ReactComponent as GitHubIcon} from 'assets/img/Vector.svg';
import "./style.css";

function NavBar() {
    return (
        <header>
          <nav className="container">
            <div className="dsMovie-nav-content">
            <a href="/" className="Initial">
              <h1>DSMovies</h1>
            </a>
              <a href="https://github.com/Bruno-Andrade49" target="_blank" className="github-link"> 
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