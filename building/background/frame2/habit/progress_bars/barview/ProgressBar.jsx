import './ProgressBar.css';

function ProgressBar({ percentage }) {
  // Pre-disposição para o backend: a variável 'percentage' será alimentada pelo backend (ex: com base nas infos da bd e markbox).
  return (
    <div className="progress-bar-wrapper">
      <div className="progress-bar-container">
        <div 
          className="progress-bar-fill"
          style={{ width: `${percentage}%` }}
        ></div>
      </div>
      <span className="progress-bar-text">{percentage}%</span>
    </div>
  );
}

export default ProgressBar;
