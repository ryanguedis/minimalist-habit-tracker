import './CadActionBox.css';
import CadActionTitle from '../tittle/CadActionTitle';

function CadActionBox() {
  return (
    <div className="cad-action-container">
      <button className="cad-action-btn">
        <CadActionTitle />
      </button>
    </div>
  );
}

export default CadActionBox;
