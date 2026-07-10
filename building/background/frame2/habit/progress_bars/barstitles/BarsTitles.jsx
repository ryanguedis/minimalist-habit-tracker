import './BarsTitles.css';
import ProgressBar from '../barview/ProgressBar';

function BarsTitles() {
  return (
    <div className="bars-titles-container">
      <div className="bars-row">
        <span className="bars-title">Dias Seguidos</span>
        <ProgressBar percentage={45} />
      </div>
      <div className="bars-row">
        <span className="bars-title">Dias Totais</span>
        <ProgressBar percentage={75} />
      </div>
    </div>
  );
}

export default BarsTitles;
