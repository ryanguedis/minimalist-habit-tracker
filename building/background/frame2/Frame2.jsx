import HabitDisplayBox from './habit/HabitDisplayBox';
import BackToFrame1 from './backtoframe1/BackToFrame1';
import '../backgroundcode/Frame1.css';
import './Frame2.css';

function Frame2({ savedHabits, onBack }) {
  return (
    <div className="frame1">
      <BackToFrame1 onBack={onBack} />
      <div className="habits-grid">
        {savedHabits.map((habit, index) => (
          <HabitDisplayBox key={index} habitName={habit} />
        ))}
      </div>
    </div>
  );
}

export default Frame2;
