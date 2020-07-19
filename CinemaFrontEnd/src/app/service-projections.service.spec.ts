import { TestBed } from '@angular/core/testing';

import { ServiceProjectionsService } from './service-projections.service';

describe('ServiceProjectionsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceProjectionsService = TestBed.get(ServiceProjectionsService);
    expect(service).toBeTruthy();
  });
});
