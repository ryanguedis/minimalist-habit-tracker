import './BarsTitles.css';
import ProgressBar from '../pbar_container/ProgressBar';

function BarsTitles() {
  return (
    <div className="bars-titles-container">
      <div className="bars-row">
        <span className="bars-title"> {'>'} Dias Seguidos </span>
        <ProgressBar mainValue={365} currentBlock={9} totalBlocks={20} />
      </div>

      <div className="bars-separator"></div>

      <div className="bars-row">
        <span className="bars-title"> {'>'} Dias Totais</span>
        <ProgressBar mainValue={365} currentBlock={15} totalBlocks={20} />
      </div>
    </div>
  );
}

export default BarsTitles;
