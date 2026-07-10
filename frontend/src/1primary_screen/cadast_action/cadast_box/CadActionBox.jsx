import './CadActionBox.css';
import CadActionTitle from '../cadast_tittle/CadActionTitle';

function CadActionBox({ onAction }) {
  return (
    <div className="cad-action-container">
      <button className="cad-action-btn" onClick={onAction}>
        <CadActionTitle />
      </button>
    </div>
  );
}

export default CadActionBox;
