import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheFilmsComponent } from './affiche-films.component';

describe('AfficheFilmsComponent', () => {
  let component: AfficheFilmsComponent;
  let fixture: ComponentFixture<AfficheFilmsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AfficheFilmsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AfficheFilmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
