import './ProgressBar.css';

function ProgressBar({ mainValue, currentBlock, totalBlocks = 20 }) {
  return (
    <div className="progress-bar-wrapper">
      <div className="progress-stats">
        <span className="progress-main-value">{mainValue}</span>
      </div>
      <div className="progress-bar-container">
        {Array.from({ length: totalBlocks }).map((_, index) => (
          <div
            key={index}
            className={`progress-block ${index < currentBlock ? 'filled' : 'empty'}`}
          ></div>
        ))}
      </div>
    </div>
  );
}

export default ProgressBar;
