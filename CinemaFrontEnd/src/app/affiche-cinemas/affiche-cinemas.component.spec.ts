import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheCinemasComponent } from './affiche-cinemas.component';

describe('AfficheCinemasComponent', () => {
  let component: AfficheCinemasComponent;
  let fixture: ComponentFixture<AfficheCinemasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AfficheCinemasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AfficheCinemasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
